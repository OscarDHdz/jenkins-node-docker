const express = require('express');
const PORT    = 3000;
var app = express();


app.get('/', (req, res) => {
  res.status(200).send({
    users: [
      {
        name: 'Oscar',
        age: 22,
        address: {
          city: 'Torreon',
          pc: 22299
        }
      },
      {
        name: 'Brenda',
        age: 24,
        addresss: {
          city: 'Monterrey',
          pc: 23048
        }
      }
    ]

  })
});



app.listen(PORT);
console.log(`Listening at: http://localhost:[36m${PORT}[0m`);
