package com.zzsz.demo.service;

import com.zzsz.demo.UserGrpc;
import com.zzsz.demo.UserProto;
import com.zzsz.demo.UserRequest;
import com.zzsz.demo.UserResponse;

import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService(UserProto.class)
public class UserService extends UserGrpc.UserImplBase{

	@Override
	public void getUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
		UserResponse uResponse = null;
		if(request.getId() == 1) {
			uResponse = UserResponse.newBuilder().setId(1).setAge(3).setName("2").build();
		}else {
			uResponse = UserResponse.newBuilder().setId(0).setAge(0).setName("管理员").build();
		}
		responseObserver.onNext(uResponse);
		responseObserver.onCompleted();
	}

}
