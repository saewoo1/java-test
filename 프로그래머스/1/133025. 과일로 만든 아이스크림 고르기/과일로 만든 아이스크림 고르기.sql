-- 코드를 입력하세요
SELECT f.FLAVOR
FROM FIRST_HALF f
INNER JOIN ICECREAM_INFO i
ON f.FLAVOR = i.FLAVOR
WHERE TOTAL_ORDER >= 3000
AND INGREDIENT_TYPE = 'fruit_based';