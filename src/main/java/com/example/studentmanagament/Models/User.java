package com.example.studentmanagament.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
// Người dùng
public class User extends BaseEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "fisrt_name")
    private String fisrtName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername(){
        return username;
    }

    // Xác định xem tài khoản của người dùng có bị hết hạn hay không. true ( còn hạn ) / false ( hết hạn )
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // Xác định xem tài khoản của người dùng có bị khóa hay không. true ( không khóa ) / false ( bị khóa )
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // Xác định xem thông tin xác thực của người dùng có hết hạn hay không. true ( còn hạn ) / false ( hết hạn )
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    //  Xác định xem tài khoản của người dùng có được kích hoạt hay không. true ( đã được kích hoạt ) / false ( chưa kích hoạt )
    @Override
    public boolean isEnabled() {
        return true;
    }
}
