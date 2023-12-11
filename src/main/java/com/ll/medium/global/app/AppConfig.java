package com.ll.medium.global.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class AppConfig {
    private static String resourcesStaticDirPath;
    public static String tempDirPath;
    public static String genFileDirPath;
    public static String siteName;
    public static String siteBaseUrl;

    public AppConfig() {
    }

    @Value("${custom.tempDirPath}")
    public void setTempDirPath(String tempDirPath) {
        AppConfig.tempDirPath = tempDirPath;
    }

    @Value("${custom.genFile.dirPath}")
    public void setGenFileDirPath(String genFileDirPath) {
        AppConfig.genFileDirPath = genFileDirPath;
    }

    @Value("${custom.site.name}")
    public void setSiteName(String siteName) {
        AppConfig.siteName = siteName;
    }

    @Value("${custom.site.baseUrl}")
    public void setSiteBaseUrl(String siteBaseUrl) {
        AppConfig.siteBaseUrl = siteBaseUrl;
    }

    public static String getResourcesStaticDirPath() {
        if (resourcesStaticDirPath == null) {
            ClassPathResource resource = new ClassPathResource("static/");

            try {
                resourcesStaticDirPath = resource.getFile().getAbsolutePath();
            } catch (IOException var2) {
                throw new RuntimeException(var2);
            }
        }

        return resourcesStaticDirPath;
    }

    public static String getTempDirPath() {
        return tempDirPath;
    }

    public static String getGenFileDirPath() {
        return genFileDirPath;
    }

    public static String getSiteName() {
        return siteName;
    }

    public static String getSiteBaseUrl() {
        return siteBaseUrl;
    }
}