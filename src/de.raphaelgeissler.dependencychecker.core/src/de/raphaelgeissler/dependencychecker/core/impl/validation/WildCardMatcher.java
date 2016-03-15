package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildCardMatcher {

	private static Pattern WILDCARD_REGEX_PATTERN = Pattern.compile("[^*]+|(\\*)");;

	public static boolean isMatching(final String value, final String expression) {
		Pattern wildcardExprAsRegex = createRegexPatternFromWildCardExpr(expression);
		return wildcardExprAsRegex.matcher(value).matches();
	}

	private static Pattern createRegexPatternFromWildCardExpr(final String expression) {
		Matcher m = WILDCARD_REGEX_PATTERN.matcher(expression);
		StringBuffer b= new StringBuffer();
		while (m.find()) {
		    if(m.group(1) != null) m.appendReplacement(b, ".*");
		    else m.appendReplacement(b, "\\\\Q" + m.group(0) + "\\\\E");
		}
		m.appendTail(b);
		
		Pattern wildcardExprAsRegex = Pattern.compile(b.toString());
		return wildcardExprAsRegex;
	}

}
