# AutomationTest

[![CI](https://github.com/ApurvaGupta29/AutomationTest/actions/workflows/ci.yml/badge.svg)](https://github.com/ApurvaGupta29/AutomationTest/actions/workflows/ci.yml)

Selenium + TestNG UI test automation project (Java 21, Maven).

## CI/CD pipeline

The pipeline is defined in `.github/workflows/ci.yml` and runs on GitHub Actions.

| Stage | Job | When it runs |
|-------|-----|--------------|
| CI | `test` | Every pull request into `master`, every push to `master`, nightly at 02:00 UTC, and on manual trigger |
| CD | `deploy` | After `test` passes, on pushes (merges) to `master` and manual runs from `master` only |

- **CI** runs the tests in Chrome under a virtual display and uploads the test reports as a build artifact.
- **CD** publishes the test report to GitHub Pages: https://apurvagupta29.github.io/AutomationTest/
- `master` is protected by a ruleset: changes go in through a pull request, and the `test` check must pass before merging.

## Workflow

1. Commit your changes on a branch (for example `release`).
2. Open a pull request into `master` and wait for the `test` check to turn green.
3. Merge. The `deploy` job then publishes the latest report.

## Run the tests locally

```
mvn test
```
