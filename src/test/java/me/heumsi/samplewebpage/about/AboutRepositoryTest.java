package me.heumsi.samplewebpage.about;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AboutRepositoryTest {

    @Autowired
    AboutRepository aboutRepository;

    /** aboutRepository 가 DB 에 잘 연동되었는지에 대한 테스트
     * DB 에 객체가 잘 들어가는지 확인합니다.
     **/
    @Test
    public void di(){
        About about = new About();
        about.setContent("test");

        About newAbout = aboutRepository.save(about);
        assertThat(newAbout).isNotNull();
    }
}
