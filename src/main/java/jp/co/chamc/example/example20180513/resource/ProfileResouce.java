package jp.co.chamc.example.example20180513.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
}
