package me.heumsi.samplewebpage.about;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {

    @Autowired
    AboutService aboutService;

    @GetMapping("/about")
    public String getAbout(Model model) {

        String content = aboutService.getRecentContent();
        model.addAttribute("content", content);

        return "page/about";
    }

    @GetMapping("/about-edit")
    public String getAboutEdit(Model model) {

        String content = aboutService.getRecentContent();
        model.addAttribute("content", content);

        return "page/about_edit";
    }

    @PostMapping("/about-edit")
    public @ResponseBody About postAboutEdit(Model model, @RequestBody About about) {

        About newAbout = aboutService.insertAbout(about);

        return newAbout;
    }
}
