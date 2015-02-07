#!/bin/bash
git init
git add ./
echo "Enter a commit description. Short and simple is best"
read commit
git commit -m "'$commit'"