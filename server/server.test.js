const request = require('supertest')
const expect = require('expect');
var {app} = require('./server.js');



describe('API TEST', function(){


    it('Should GET an array of users', function(done){

        request(app)
        .get('/')
        .expect(200)
        .expect(function(response) {
            expect(response.body.users.length).toEqual(2);
        })
        .end(done)

    })

})