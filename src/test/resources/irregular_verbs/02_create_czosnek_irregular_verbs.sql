CREATE TABLE czosnek_irregular_verbs (
  id BIGINT PRIMARY KEY,
  infinitive VARCHAR(99),
  past_simple VARCHAR(99),
  past_participle VARCHAR(99),
  translation_pl VARCHAR(99)
)
;

CREATE INDEX czosnek_irregular_verbs_infinitive ON czosnek_irregular_verbs(infinitive);
CREATE INDEX czosnek_irregular_verbs_past_simple ON czosnek_irregular_verbs(past_simple);
CREATE INDEX czosnek_irregular_verbs_past_participle ON czosnek_irregular_verbs(past_participle);
CREATE INDEX czosnek_irregular_verbs_translation_pl ON czosnek_irregular_verbs(translation_pl);
