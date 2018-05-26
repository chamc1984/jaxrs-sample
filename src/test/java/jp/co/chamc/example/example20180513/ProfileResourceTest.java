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
		dispatcher.getRegistry().addResourceFactory(new POJOResourceFactory(ProfileResouce.class));

		MockHttpResponse response = new MockHttpResponse();
		dispatcher.invoke(MockHttpRequest.get("http://localhost/profile/get/"), response);

		// assertThat(
		// response.getContentAsString(),
		// containsString("HOGE"));

		Assert.assertNotNull(response);
	}

	/**
	 * 正常性テスト（Input param="1"）.
	 * 
	 * @throws Exception
	 */
	@Test
	public void selectTest1() throws Exception {

		String inputparam = "1";

		Dispatcher dispatcher = MockDispatcherFactory.createDispatcher();
		dispatcher.getRegistry().addResourceFactory(new POJOResourceFactory(ProfileResouce.class));

		MockHttpResponse response = new MockHttpResponse();
		dispatcher.invoke(MockHttpRequest.get("http://localhost/profile/select/" + "?param=" + inputparam), response);

		// assertThat(
		// response.getContentAsString(),
		// containsString("HOGE"));
		// System.out.println(response); //
		// org.jboss.resteasy.mock.MockHttpResponse@5eefa415
		// System.out.println(response.getContentAsString()); // 1
		// System.out.println(response.getContentAsString().contains("1")); //
		// true

		Assert.assertTrue(response.getContentAsString().contains("1"));
	}

	/**
	 * 正常性テスト（Input param="2"）.
	 * 
	 * @throws Exception
	 */
	@Test
	public void selectTest2() throws Exception {

		String inputparam = "2";

		Dispatcher dispatcher = MockDispatcherFactory.createDispatcher();
		dispatcher.getRegistry().addResourceFactory(new POJOResourceFactory(ProfileResouce.class));

		MockHttpResponse response = new MockHttpResponse();
		dispatcher.invoke(MockHttpRequest.get("http://localhost/profile/select/" + "?param=" + inputparam), response);

		Assert.assertTrue(response.getContentAsString().contains(inputparam));
	}

	/**
	 * 正常性テスト（Input param="3"）.
	 * 
	 * @throws Exception
	 */
	@Test
	public void selectTest3() throws Exception {

		String inputparam = "3";

		Dispatcher dispatcher = MockDispatcherFactory.createDispatcher();
		dispatcher.getRegistry().addResourceFactory(new POJOResourceFactory(ProfileResouce.class));

		MockHttpResponse response = new MockHttpResponse();
		dispatcher.invoke(MockHttpRequest.get("http://localhost/profile/select/" + "?param=" + inputparam), response);

		Assert.assertTrue(response.getContentAsString().contains(inputparam));
	}

}
