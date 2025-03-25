-- 코드를 작성해주세요
SELECT c.ID, c.GENOTYPE, p.GENOTYPE AS PARENT_GENOTYPE 
FROM ECOLI_DATA c 
INNER JOIN ECOLI_DATA p ON c.PARENT_ID = p.ID 
WHERE (c.GENOTYPE & p.GENOTYPE) = p.GENOTYPE 
ORDER BY c.ID