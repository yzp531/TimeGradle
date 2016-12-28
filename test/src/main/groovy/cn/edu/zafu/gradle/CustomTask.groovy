package cn.edu.zafu.gradle;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction;

/**
 * @author lizhangqu
 * @since 2016-03-03 10:27
 */
public class CustomTask extends DefaultTask {

    @TaskAction
    void output() {
        println "param1 is ${project.pluginExt.param1}"
        println "param2 is ${project.pluginExt.param2}"
        println "param3 is ${project.pluginExt.param3}"
        println "nestparam1 is ${project.pluginExt.nestExt.nestParam1}"
        println "nestparam2 is ${project.pluginExt.nestExt.nestParam2}"
        println "nestparam3 is ${project.pluginExt.nestExt.nestParam3}"
    }
}
