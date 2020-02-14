package me.heumsi.samplewebpage.about;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AboutServiceTest {

    @Autowired
    AboutService aboutService;

    @Test
    public void getRecentContent() {
        About about = new About();
        about.setContent("test");

        aboutService.insertAbout(about);
        String content = aboutService.getRecentContent();
        assertThat(about.getContent(), is(content));
    }
}
