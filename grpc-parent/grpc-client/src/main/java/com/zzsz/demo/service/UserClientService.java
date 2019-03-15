package com.zzsz.demo.service;

import org.springframework.stereotype.Service;
import com.zzsz.demo.UserGrpc;
import com.zzsz.demo.UserGrpc.UserBlockingStub;
import com.zzsz.demo.UserRequest;
import com.zzsz.demo.UserResponse;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;

@Service
public class UserClientService {
	
	@GrpcClient("grpc-server")
	private Channel channel;
	
	public String get(int id) {
		UserBlockingStub stub = UserGrpc.newBlockingStub(channel);
		UserResponse user = stub.getUser(UserRequest.newBuilder().setId(id).build());
		System.out.println(user.getName());
		return user.getName();
	}

}
