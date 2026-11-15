package com.helpdesk_management.service;

import java.util.List;

import com.helpdesk_management.dto.user.CreateUserRequest;
import com.helpdesk_management.dto.user.UpdateUserRequest;
import com.helpdesk_management.dto.user.UpdateUserStatusRequest;
import com.helpdesk_management.dto.user.UserResponse;

public interface UserService {

	public UserResponse createUser(CreateUserRequest request);

	public List<UserResponse> getAllUsers();

	public UserResponse getUserById(Long id);

	public UserResponse updateUser(Long id, UpdateUserRequest request);

	public UserResponse updateUserStatus(Long id, UpdateUserStatusRequest request);
}
