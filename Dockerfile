FROM node:8-alpine

RUN mkdir -p /home/api

WORKDIR /home/api

COPY ./server       .
COPY ./package.json .

RUN npm install

CMD ["npm","start"]