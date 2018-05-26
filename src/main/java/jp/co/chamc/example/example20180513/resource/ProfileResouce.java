package jp.co.chamc.example.example20180513.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author takanorihara
 *
 */
@Path("profile")
public class ProfileResouce {

    /**
     * プロフィールのリスト表示.
     *
     * @return プロフィールリスト
     */
    @GET
    @Path("get")
    @Produces("text/plain")
    public String get() {

        String result = "return profile list";

        return result;
    }

    /**
     * 選択.
     *
     * @return 選択された値
     */
    @GET
    @Path("select")
    @Produces("text/plain")
    public String select(@QueryParam("param") String param) {

        String result = "default";

    	if ("1".equals(param)) {
            result = param;
    	} else if ("2".equals(param)) {
    		result = param;
    	} else {
    		result = param;
    	}

        return result;
    }

}
