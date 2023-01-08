package com.pocket.wallet.transfomers;

import com.pocket.wallet.dto.UserDto;
import com.pocket.wallet.models.UserModel;
import com.pocket.wallet.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserTransformer implements IParentTransformer<UserDto, UserModel, UserResponse> {

    @Override
    public UserModel transformRequest(UserDto request) {
        UserModel model=new UserModel();
        model.setAsyncId(UUID.randomUUID().toString());
        model.setFirstName(request.getFirstName());
        model.setLastName(request.getLastName());
        model.setEmail(request.getEmail());
        model.setPhone(request.getPhone());
        model.setPassword(request.getPassword());
        model.setCategory(request.getCategory());
        return model;
    }

    @Override
    public UserResponse transformResponse(UserModel model) {
        UserResponse response=new UserResponse();
        response.setAsyncId(model.getAsyncId());
        response.setFirstName(model.getFirstName());
        response.setLastName(model.getLastName());
        response.setEmail(model.getEmail());
        response.setPhone(model.getPhone());
        response.setPassword(model.getPassword());
        response.setCategory(model.getCategory());
        return response;
    }
}