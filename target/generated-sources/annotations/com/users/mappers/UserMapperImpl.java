package com.users.mappers;

import com.users.dto.UserDto;
import com.users.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-24T13:39:46+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setEmail( user.getEmail() );
        userDto.setDateOfBirth( user.getDateOfBirth() );

        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setEmail( userDto.getEmail() );
        user.setDateOfBirth( userDto.getDateOfBirth() );

        return user;
    }

    @Override
    public void updateEntity(User user, UserDto userDto) {
        if ( userDto == null ) {
            return;
        }

        user.setEmail( userDto.getEmail() );
        user.setDateOfBirth( userDto.getDateOfBirth() );
    }
}
