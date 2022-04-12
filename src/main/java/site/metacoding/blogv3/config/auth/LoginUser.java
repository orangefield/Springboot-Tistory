package site.metacoding.blogv3.config.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import site.metacoding.blogv3.domain.user.User;

@Data
@RequiredArgsConstructor
public class LoginUser implements UserDetails {

    private final User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 지금 안함!
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        // 계산해서 직접 만들어야 한다. 지금은 일단 true
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // 계산해서 직접 만들어야 한다. 지금은 일단 true
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // 계산해서 직접 만들어야 한다. 지금은 일단 true
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 계산해서 직접 만들어야 한다. 지금은 일단 true
        return true;
    }

}
