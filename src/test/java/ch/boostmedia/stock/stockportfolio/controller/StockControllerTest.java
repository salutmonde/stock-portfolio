package ch.boostmedia.stock.stockportfolio.controller;

import ch.boostmedia.stock.stockportfolio.dto.StockDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class StockControllerTest {
    @LocalServerPort
    private int port;
    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void createStockTest(){
        StockDto stockDto = new StockDto("h");
        HttpEntity<StockDto> requestEntity = new HttpEntity(stockDto);

        ResponseEntity<StockDto> stockDtoResponseEntity = restTemplate.postForEntity("http://localhost:" + port + "/stock/create", requestEntity, StockDto.class);
    }
}