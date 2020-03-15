/**
 * 
 */
package com.samples.java.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samples.java.feign.client.model.Post;

/**
 * @author cgpra
 *
 */
@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceholderClient {
	@RequestMapping(method = RequestMethod.GET, value = "/posts")
	List<Post> getPosts();

	@RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}")
	Post getPostById(@PathVariable("postId") Long postId);
}
