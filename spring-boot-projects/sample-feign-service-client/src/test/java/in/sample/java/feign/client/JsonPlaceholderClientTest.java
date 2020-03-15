package in.sample.java.feign.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.samples.java.feign.client.JsonPlaceholderClient;
import com.samples.java.feign.client.model.Post;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonPlaceholderClientTest {

	@Autowired
	JsonPlaceholderClient jsonPlaceholderClient;

	@Test
	public void testGetPosts() {
		List<Post> posts = jsonPlaceholderClient.getPosts();
		assertNotNull(posts);
	}

	@Test
	public void testGetPostById() {
		Post post = jsonPlaceholderClient.getPostById(1L);
		assertNotNull(post);
	}
}
