// Importing necessary modules
const express = require('express');
const bodyParser = require('body-parser');
const routes = require('./routes');

// Initialize Express app
const app = express();

// Middleware
app.use(bodyParser.json());

// Routes
app.use('/api', routes);

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}`);
});
