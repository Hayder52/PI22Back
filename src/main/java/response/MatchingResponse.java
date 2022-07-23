package response;

import java.util.List;

import lombok.Data;

@Data
public class MatchingResponse {
	 private String name;
	 private Long idUsser;
	    private List<String> favoris;
}
