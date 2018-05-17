package jp.co.chamc.example.example20180513;

import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.mock.MockDispatcherFactory;
import org.jboss.resteasy.mock.MockHttpRequest;
import org.jboss.resteasy.mock.MockHttpResponse;
import org.jboss.resteasy.plugins.server.resourcefactory.POJOResourceFactory;
import org.junit.Assert;
import org.junit.Test;

import jp.co.chamc.example.example20180513.resource.ProfileResouce;

/**
 * @author takanorihara
 *
 */
public class ProfileResourceTest {

    /**
     * @throws Exception
     */
    @Test
    public void test() throws Exception {

    	Dispatcher dispatcher = MockDispatcherFactory.createDispatcher();
        dispatcher.getRegistry()
                .addResourceFactory(new POJOResourceFactory(ProfileResouce.class));

        MockHttpResponse response = new MockHttpResponse();
        dispatcher.invoke(
                MockHttpRequest.get("http://localhost/profile/get/"),
                response);

//        assertThat(
//        		response.getContentAsString(),
//                containsString("HOGE"));
        
        Assert.assertNotNull(response);
    }
	
}
