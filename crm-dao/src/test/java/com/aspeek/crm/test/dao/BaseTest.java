package com.aspeek.crm.test.dao;

import com.aspeek.crm.Application;
import com.aspeek.crm.dao.domain.Note;
import com.aspeek.crm.dao.repository.JpaNoteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by xulingming on 2017/10/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@WebAppConfiguration
public class BaseTest {

    @Autowired
    JpaNoteRepository jpaNoteRepository;

    @Test
    public void testJpaNote() {
        List<Note> notes = jpaNoteRepository.findAll();
        System.out.printf("");
    }

}
