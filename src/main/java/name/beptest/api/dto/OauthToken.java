package name.beptest.api.dto;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
public class OauthToken {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public static class response {
		private String access_token;
		private String token_type;
		private String refresh_token;
		private long expires_in;
		private String scope;
	}
	
	@Data
	public static class request {
		
		@Data
		public static class accessToken {
			public String code;
			private String grant_type;
			private String redirect_uri;
			
			public Map getMapData() {
				Map map = new HashMap();
				map.put("code", code);
				map.put("grant_type", grant_type);
				map.put("redirect_uri", redirect_uri);
				return map;
			}
		}
		
		@Data
		public static class refreshToken {
			private String refreshToken;
			private String grant_type;
			
			public Map getMapData() {
				Map map = new HashMap();
				map.put("refreshToken", refreshToken);
				map.put("grant_type", grant_type);
				return map;
			}
		}
	}
}
