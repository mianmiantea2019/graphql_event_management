package com.spring2go.easyevent.type;

/**
 * @author: Christy Guo
 * @create_date: 2023-05-02 11:23 PM
 * @desc:
 * @modifier:
 */


import com.spring2go.easyevent.entity.UserEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private Integer id;
    private String email;
    private String password;
    private List<Event> createdEvents = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public static User fromEntity(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setEmail(userEntity.getEmail());
        return user;
    }
}
