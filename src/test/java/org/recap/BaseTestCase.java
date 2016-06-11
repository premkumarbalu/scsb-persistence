package org.recap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReCapMiddlewarePersistenceApplication.class)
@WebAppConfiguration
@Transactional(rollbackForClassName={})
public class BaseTestCase {

	@Test
	public void contextLoads() {

	}

}