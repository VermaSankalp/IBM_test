SELECT owner_id, owner_name, COUNT(category_id) as countCategory
FROM owner, category, article, category_article_mapping
WHERE article.owner_id = owner.owner_id AND article.article_id = category_article_mapping.article_id AND category_article_mapping.category_id = category.category_id
ORDER BY countCategory;