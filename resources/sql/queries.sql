-- :name first-10 :? :*
-- :doc get the first 10 entries from songs
SELECT * FROM songs
LIMIT 10

-- :name songs-by :?
-- :doc Get songs by author or title
SELECT * FROM songs
WHERE author ~* :term
  OR title ~* :term
LIMIT 20
