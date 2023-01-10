package com.javatechie.springbatchdemo.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.launch.support.TaskExecutorJobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @PostMapping("/importCustomers")
    public void importCsvToDBJobs()   {
        JobParameters jobParameters=new JobParametersBuilder()
                .addLong("startAt",System.currentTimeMillis()).toJobParameters();
        try
        {
            jobLauncher.run(job,jobParameters);
        }
        catch (JobInstanceAlreadyCompleteException| JobExecutionAlreadyRunningException| JobParametersInvalidException| JobRestartException e)
        {
            e.printStackTrace();
        }
    }
}
