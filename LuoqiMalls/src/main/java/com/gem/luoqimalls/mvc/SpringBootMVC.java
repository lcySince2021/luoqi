package com.gem.luoqimalls.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.MultipartConfigElement;

//WebMvcConfigurer contrl的增强配置,比如过滤器,文件上传等,control时会先执行他
//springMVC.xml的替代品
@Configuration
public class SpringBootMVC implements WebMvcConfigurer{
    @Autowired
    private LoginIntercepter loginIntercepter;

    //虚拟路径配置
    @Value("${web.upload-path}")
    private String path;

//    可以接受上传信息
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory(); //文件最大KB,MB
        factory.setMaxFileSize("2MB"); //设置总上传数据总大小
        factory.setMaxRequestSize("10MB");//处理图片上传的对象
        return factory.createMultipartConfig();
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        给html添加一个control,让html可以访问
//        给/html/login.html添加一个名为toLogin的control,自动添加
        registry.addViewController("/toLogin").setViewName("home/login");
        registry.addViewController("/tozhuche").setViewName("/home/register");
        registry.addViewController("/tomain").setViewName("home/home");
        registry.addViewController("/w1").setViewName("/w1/index");
        registry.addViewController("/w0").setViewName("/滑动验证/index");
        registry.addViewController("/w2").setViewName("/样式/index");
        registry.addViewController("/pwd").setViewName("/person/password");
        registry.addViewController("/goods").setViewName("/home/introduction");
        registry.addViewController("/shopcart").setViewName("/home/shopcart");
        registry.addViewController("/change").setViewName("/person/informationchange");
        registry.addViewController("/foot").setViewName("/person/foot");
        registry.addViewController("/hui").setViewName("/多优惠/index");
        registry.addViewController("/down").setViewName("/底部/down");
        registry.addViewController("/vip").setViewName("/会员付款/index");
        registry.addViewController("/welcome").setViewName("/admin/welcome");

        registry.addViewController("/jifen1").setViewName("/积分/jifenduihuan");
        registry.addViewController("/jifen2").setViewName("/积分/jifenmingxi");
        registry.addViewController("/jifen3").setViewName("/积分/jifenxiangqing");
        registry.addViewController("/duomai").setViewName("/多买多惠/index");
        registry.addViewController("/shops").setViewName("/my/introduction");
        registry.addViewController("/").setViewName("/toLogin");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//       registry.addInterceptor(loginIntercepter).
//               addPathPatterns("/**").//拦截所有的请求
//               excludePathPatterns("/toLogin","/home/login");//除了登录请求不拦截
//    }
//
//    //关于静态资源的html,直接放行,直接放行
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/html/**").addResourceLocations("classpath:/html/*");
//    }
}
