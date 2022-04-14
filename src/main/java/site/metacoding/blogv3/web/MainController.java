package site.metacoding.blogv3.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import site.metacoding.blogv3.config.auth.LoginUser;

@Controller
public class MainController {

    @GetMapping({ "/" })
    public String main(@AuthenticationPrincipal LoginUser loginUser) {
        // 이렇게 @AuthenticationPrincipal 써라
        // System.out.println(loginUser.getUsername());
        // System.out.println(loginUser.getUser().getUsername());

        // 이렇게 꺼내지 말고
        // LoginUser lu = (LoginUser)
        // SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        // System.out.println(lu.getUser().getEmail());

        if (loginUser == null) {
            return "main";
        } else {
            return "redirect:/user/" + loginUser.getUser().getId() + "/post";
        }
    }
}
