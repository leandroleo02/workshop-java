package com.thoughtworks.workshop.application.endpoint;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImageProcessorEndpointTest {

    private ImageProcessorEndpoint endpoint;

    @Before
    public void setUp() {
        this.endpoint = new ImageProcessorEndpoint();
    }

    @Test
    public void shouldReturnNonNullResponseWhenRequestIsValid() {
        Request request = new Request();
        request.imageUrl = "/any_url_image.png";

        Response response = this.endpoint.processImage(request);

        assertThat(response)
                .isNotNull();
    }
}