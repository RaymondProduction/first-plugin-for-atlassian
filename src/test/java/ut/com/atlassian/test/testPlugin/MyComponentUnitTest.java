package ut.com.atlassian.test.testPlugin;

import org.junit.Test;
import com.atlassian.test.testPlugin.api.MyPluginComponent;
import com.atlassian.test.testPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}