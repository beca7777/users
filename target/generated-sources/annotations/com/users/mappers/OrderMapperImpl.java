package com.users.mappers;

import com.users.dto.OrderDto;
import com.users.dto.UserDto;
import com.users.entities.Order;
import com.users.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-24T13:39:46+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto toDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( order.getId() );
        orderDto.setDeliveryDate( order.getDeliveryDate() );
        orderDto.setOrderDate( order.getOrderDate() );
        orderDto.setUser( userToUserDto( order.getUser() ) );

        return orderDto;
    }

    @Override
    public Order toEntity(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDto.getId() );
        order.setDeliveryDate( orderDto.getDeliveryDate() );
        order.setOrderDate( orderDto.getOrderDate() );
        order.setUser( userDtoToUser( orderDto.getUser() ) );

        return order;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setEmail( user.getEmail() );
        userDto.setDateOfBirth( user.getDateOfBirth() );

        return userDto;
    }

    protected User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setEmail( userDto.getEmail() );
        user.setDateOfBirth( userDto.getDateOfBirth() );

        return user;
    }
}
