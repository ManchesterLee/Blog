package cn.manchester.blog.article;

import cn.manchester.blog.account.facade.AccountFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "cn.manchester.blog")
public class ArticleApplication {
    @Autowired
    private AccountFacade accountFacade;

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class);
    }

}
