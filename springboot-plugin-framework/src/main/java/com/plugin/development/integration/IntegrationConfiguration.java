package com.plugin.development.integration;

import org.pf4j.RuntimeMode;


/**
 * @Description: 插件集成时的配置接口。插件集成的配置接口
 * @Author: zhangzhuo
 * @Version: 1.0
 * @Create Date Time: 2019-05-26 19:14
 * @Update Date Time:
 * @see
 */
public interface IntegrationConfiguration {

    /**
     * 运行环境
     * @return
     */
    RuntimeMode environment();

    /**
     * 插件的路径
     * @return
     */
    String pluginDir();

    /**
     * 插件文件的配置路径
     * @return
     */
    String pluginConfigFileDir();

}