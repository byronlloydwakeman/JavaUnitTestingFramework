package com.TestFramework;

import java.util.List;

public class TestModel
{
    private boolean _passed;
    public boolean Passed()
    {
        return _passed;
    }

    private String _resultMessage;
    public String GetResultMessage()
    {
        return _resultMessage;
    }

    private String _root;
    public TestModel(String root)
    {
        _root = root;
    }

    //This function could get called by a testing class
    public void Equals(Object expected, Object actual)
    {
        _passed = expected.equals(actual);
        _resultMessage = String.format("Root: %s, Expected: %s, Actual: %s",
                _root, expected, actual);
    }

    //Other methods...
    public <T> void Contains(T element, List<T> elements)
    {
        //Some code...
        _passed = elements
                .stream()
                .anyMatch((e) -> e.equals(element));
        _resultMessage = _passed ? String.format("%s 's contains %s",
                elements, element) : String.format("%s 's doesn't contain %s",
                elements, element);
    }
}
