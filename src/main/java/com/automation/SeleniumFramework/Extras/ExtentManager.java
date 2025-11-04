package com.automation.SeleniumFramework.Extras;

import com.aventstack.extentreports.ExtentReports;     // for older extentreports 3.x
import com.aventstack.extentreports.reporter.ExtentSparkReporter;     // for extentreports 5+
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {
    private static ExtentReports extent;
    private static final String OUTPUT_FOLDER = "test-output/extent-reports/";
    private static final String FILE_NAME = "ExtentReport.html";

    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    private static void createInstance() {
        try {
            Path outFolder = Paths.get(OUTPUT_FOLDER);
            if (!Files.exists(outFolder)) {
                Files.createDirectories(outFolder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String reportPath = OUTPUT_FOLDER + "ExtentReport_" + timestamp + ".html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Selenium Automation Results");
        spark.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        // system info
        extent.setSystemInfo("Project", "Selenium Automation Framework");
        extent.setSystemInfo("Tester", "Aditya Kumar");
        extent.setSystemInfo("Environment", "DemoQA");
    }
}
