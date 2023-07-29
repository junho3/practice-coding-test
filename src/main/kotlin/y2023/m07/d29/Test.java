package y2023.m07.d29;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {

    public String test(String[] params) {
        return Arrays.stream(params)
                .filter(str -> str.length() >= 5 && str.length() <= 10)
                .findFirst()
                .map(String::toUpperCase)
                .orElse("없음");
    }

    public String solution2(String[] leftArray, String[] rightArray) {
        Set<String> lefts = new HashSet<>(Arrays.asList(leftArray));
        Set<String> rights = new HashSet<>(Arrays.asList(rightArray));

        lefts.retainAll(rights);

        if (lefts.isEmpty()) {
            return "없음";
        }

        return lefts.stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

    public String[] solution3(String[] productInfo, String[] dailyProductSales) {
        // 상품코드: <상품명, 금액>
        Map<String, Map.Entry<String, Integer>> productInfoMap = Arrays.stream(productInfo)
                .map(product -> product.split(","))
                .collect(Collectors.toMap(values -> values[0], values -> Map.entry(values[1], Integer.parseInt(values[2]))));

        // 날짜, 상품코드, 개수
        return Arrays.stream(dailyProductSales)
                .map(sales -> {
                    String[] values = sales.split(",");

                    return createResult(
                            values[0],
                            values[1],
                            Integer.parseInt(values[2]),
                            productInfoMap.get(values[1])
                    );
                })
                .toArray(String[]::new);
    }

    private String createResult(
            String salesDate,
            String productCode,
            Integer quantity,
            Map.Entry<String, Integer> productInfo
    ) {
        // 날짜, 코드, 상품명, 금액
        return String.format(
                "%s,%s,%s,%d",
                salesDate,
                productCode,
                productInfo.getKey(),
                productInfo.getValue() * quantity
        );
    }

    public String solution4(String pathVariableUrl) {
        Pattern pattern = Pattern.compile("/payment/(\\d{1,9})/([a-zA-Z]{1,10})");
        Matcher matcher = pattern.matcher(pathVariableUrl);

        if (matcher.find()) {
            String paymentId = matcher.group(1);
            String paymentMethod = matcher.group(2);

            return Optional.of("/payment/" + paymentMethod + "?paymentId=" + paymentId)
                    .orElse("error");
        }
        // 코드 작성 위치
        return "error";

    }
}
