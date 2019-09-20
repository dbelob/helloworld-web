package acme.hello;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/")
public interface HelloClient {
    @Get
    Single<String> hello();
}