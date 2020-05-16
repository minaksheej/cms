package springfive.cms.service;

import java.util.List;

import springfive.cms.models.News;
import springfive.cms.request.models.NewsRequest;

public interface NewsService {

	News findOne(String id);

	List<News> findAll();

	News createNews(NewsRequest newsRequest);

	News updateNews(NewsRequest newsRequest, String id);

	

}
