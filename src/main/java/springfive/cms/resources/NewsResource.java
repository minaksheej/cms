package springfive.cms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import springfive.cms.models.News;
import springfive.cms.request.models.NewsRequest;
import springfive.cms.service.NewsService;

@RestController
@RequestMapping("/api/news")
public class NewsResource {

	@Autowired
	private NewsService newsService;

	@GetMapping("/{id}")
	public ResponseEntity<News> findOne(@PathVariable("id") String id) {
		return new ResponseEntity<News>(newsService.findOne(id), HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<News>> findAll() {
		return new ResponseEntity<List<News>>(newsService.findAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<News> newNews(@RequestBody NewsRequest newsRequest) {
		return new ResponseEntity<News>(newsService.createNews(newsRequest), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeNews(@PathVariable("id") String id) {

	}

	public ResponseEntity<News> update(@RequestBody NewsRequest newsRequest, @PathVariable("id") String id) {
		return new ResponseEntity<News>(newsService.updateNews(newsRequest,id),HttpStatus.OK);
	}
}
