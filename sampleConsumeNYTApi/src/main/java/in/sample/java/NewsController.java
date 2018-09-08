package in.sample.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news/")
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "/topstories", method = RequestMethod.GET)
	public @ResponseBody News getNews() throws Exception {

		return newsService.getTopStories();
	}

}