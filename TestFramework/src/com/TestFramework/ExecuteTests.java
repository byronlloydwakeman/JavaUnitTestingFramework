package com.TestFramework;

import java.util.ArrayList;
import java.util.List;

public class ExecuteTests
{
    private List<TestModel> testModels = new ArrayList<>();
    public void AddTest(TestModel test)
    {
        testModels.add(test);
    }

    private String _testsName;
    public ExecuteTests(String testsName)
    {
        _testsName = testsName;
    }

    public void Run()
    {
        System.out.println("Starting Tests " + _testsName);

        System.out.println("Failed Tests...");
        for(TestModel test : testModels)
        {
            if (!test.Passed())
            {
                System.out.println(test.GetResultMessage());
            }
        }

        System.out.println("Tests Complete");
    }
}
