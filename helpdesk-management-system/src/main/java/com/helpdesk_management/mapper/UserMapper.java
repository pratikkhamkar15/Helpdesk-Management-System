package com.helpdesk_management.mapper;

import org.springframework.stereotype.Component;

import com.helpdesk_management.dto.user.CreateUserRequest;
import com.helpdesk_management.dto.user.UpdateUserRequest;
import com.helpdesk_management.dto.user.UpdateUserStatusRequest;
import com.helpdesk_management.dto.user.UserResponse;
import com.helpdesk_management.enums.UserStatus;
import com.helpdesk_management.model.User;

@Component
public class UserMapper {

	
	public UserResponse toResponse(User user) {
		UserResponse response = new UserResponse();
		response.setId(user.getId());
		response.setFirstName(user.getFirstName());
		response.setLastName(user.getLastName());
		response.setEmail(user.getEmail());
		response.setRole(user.getRole());
		response.setStatus(user.getStatus());
		response.setDepartment(user.getDepartment());
		response.setCreatedAt(user.getCreatedAt());
		response.setUpdatedAt(user.getUpdatedAt());
		return response;
	}
	
	public User toEntity(CreateUserRequest request) {
		User user = new User();
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setDepartment(request.getDepartment());
		user.setRole(request.getRole());
		user.setStatus(UserStatus.ACTIVE);
		return user;
	}
	
	
	public void toEntity(User user, UpdateUserRequest request) {
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setEmail(request.getEmail());
		user.setRole(request.getRole());
		user.setDepartment(request.getDepartment());
	}
	
	public void toEntity(User user, UpdateUserStatusRequest request) {
		user.setStatus(request.getStatus());
	}
	
}
