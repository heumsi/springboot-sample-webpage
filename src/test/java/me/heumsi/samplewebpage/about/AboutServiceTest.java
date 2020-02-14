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

    /** getRecentContent 가 잘 작동하는지에 대한 테스트
     * DB 에 객체를 넣고, getRecentContent 로 두 객체가 일치하는지 확인합니다.
     **/
    @Test
    public void getRecentContent() {
        About about = new About();
        about.setContent("test");

        aboutService.insertAbout(about);
        String content = aboutService.getRecentContent();
        assertThat(about.getContent(), is(content));
    }
}
