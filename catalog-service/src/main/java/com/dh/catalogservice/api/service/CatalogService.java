package com.dh.catalogservice.api.service;

import com.dh.catalogservice.api.client.IMovieServiceClient;
import com.dh.catalogservice.domain.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CatalogService implements ICatalogService {

    private final IMovieServiceClient iMovieServiceClient;

    public CatalogService(IMovieServiceClient iMovieServiceClient) {
        this.iMovieServiceClient = iMovieServiceClient;
    }

    @Override
    public List<Movie> getMovieByGenre(String genre) {
        return iMovieServiceClient.getMovieByGenre(genre);
    }

}
